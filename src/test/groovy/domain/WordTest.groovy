package domain

import com.pickshell.domain.Word
import org.junit.Test

/**
 * Created by uc212310 on 12/4/2017.
 */
class WordTest {
    @Test
    public void TestToString(){
        Word word = new Word(id:1,name: 'moon')
        assert word.toString() == 'com.pickshell.domain.Word(1, moon)'
    }
}
