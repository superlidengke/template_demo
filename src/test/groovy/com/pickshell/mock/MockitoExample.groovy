import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MockitoExample {
    @Test
    public void test() {
        List<String> mockList = mock(List.class);
        println mockList.add("First");
        when(mockList.get(0)).thenReturn("Mockito");
        when(mockList.get(1)).thenReturn("JCG");
        assertEquals("Mockito", mockList.get(0));
        assertEquals("JCG", mockList.get(1));
    }
    @Test
    public void verifyInteractions() {
        Set mockSet = mock(Set.class);
        Set<String> toAdd = new HashSet<String>();
        mockSet.addAll(toAdd);
        mockSet.clear();
        verify(mockSet).addAll(toAdd);
        verify(mockSet).clear();
        //Stub method calls
        assert mockSet.size() == 0
        when(mockSet.size()).thenReturn(10);
        assert mockSet.size() == 10
    }
    @Test
    public void verifyNoInteractions(){
        Set mockSet = mock(Set.class);
        verifyZeroInteractions(mockSet)
    }
    @Test
    public void verify_no_more_interaction() {
        Set mockSet = mock(Set.class);
        mockSet.size()
        verify(mockSet).size()
        verifyNoMoreInteractions(mockSet)
    }
    @Test
    public void testSpy() {
        List list = new LinkedList();
        List spy = spy(list);
        try {
            when(spy.get(0)).thenReturn("foo");
        } catch(IndexOutOfBoundsException e) {
            // Expected
            println("can't use when with spy")
        }
        doReturn("foo").when(spy).get(0);
        assert spy.get(0)== 'foo'
    }
}