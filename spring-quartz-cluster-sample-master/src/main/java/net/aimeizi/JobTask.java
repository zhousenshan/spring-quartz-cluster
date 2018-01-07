package net.aimeizi;

import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Quartz需要执行的task
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class JobTask extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时任务开始 了啦，我是老电脑"+new Date());
    }

}
