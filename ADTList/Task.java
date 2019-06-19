/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class Task{

    String job;
    int priority;

    /**
     * @param priority
     */
    public Task(int priority) {
        this.priority=priority;
    }

    /**
     * @param job
     * @param priority
     */
    public Task(String job, int priority) {
        this.job=job;
        this.priority=priority;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job=job;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority=priority;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Task [job=" + job + ", priority=" + priority + "]";
    }

}
