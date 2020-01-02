package com.sonarone.flowable.springboot.handler;


import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * 
 * @author sonarone
 * @date 2018/12/19
 */
public class BossTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("******************************老板*******************************************");
        delegateTask.setAssignee("老板");
    }

}
