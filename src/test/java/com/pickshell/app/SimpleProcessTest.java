package com.pickshell.app;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

public class SimpleProcessTest {
	
	@Test
	public void startBookOrder() {
		ProcessEngine processEngine = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration()
				// .createStandaloneProcessEngineConfiguration()
				.buildProcessEngine();

		RepositoryService repositoryService = processEngine.getRepositoryService();
		RuntimeService runtimeService = processEngine.getRuntimeService();
		IdentityService identityService = processEngine.getIdentityService();
		repositoryService.createDeployment().addClasspathResource("bookorder.bpmn20.xml").deploy();
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put("isbn", "123456");
		identityService.setAuthenticatedUserId("kermit");
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("bookorder", variableMap);
		assertNotNull(processInstance.getId());
		/*
		 * TaskService taskService = processEngine.getTaskService(); List<Task>
		 * taskList =
		 * taskService.createTaskQuery().taskCandidateUser("kermit").list();
		 * assertEquals(1, taskList.size()); System.out.println("found task " +
		 * taskList.get(0).getName());
		 * taskService.complete(taskList.get(0).getId());
		 */
	}

}
