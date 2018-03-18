package com.luoxiang.project.po;

public class Baomingqingkuang {
    private Integer jobId;

    private String jobunit;

    private String job;

    private String jobcode;

    private Integer numbers;

    private Integer needpersionnum;

    private String testare;

    private String perfessional;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobunit() {
        return jobunit;
    }

    public void setJobunit(String jobunit) {
        this.jobunit = jobunit == null ? null : jobunit.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode == null ? null : jobcode.trim();
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Integer getNeedpersionnum() {
        return needpersionnum;
    }

    public void setNeedpersionnum(Integer needpersionnum) {
        this.needpersionnum = needpersionnum;
    }

    public String getTestare() {
        return testare;
    }

    public void setTestare(String testare) {
        this.testare = testare == null ? null : testare.trim();
    }

    public String getPerfessional() {
        return perfessional;
    }

    public void setPerfessional(String perfessional) {
        this.perfessional = perfessional == null ? null : perfessional.trim();
    }
}