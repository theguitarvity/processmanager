package com.facom.mrlopito.processmanager;

public class Process {
	private int pid;
	private int tpid;
	private int tcid;
	private int tbid;
	
	public Process() {
		
	}
	
	public Process(int pid, int tpid, int tcid, int tbid) {
		super();
		this.pid = pid;
		this.tpid = tpid;
		this.tcid = tcid;
		this.tbid = tbid;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getTpid() {
		return tpid;
	}
	public void setTpid(int tpid) {
		this.tpid = tpid;
	}
	public int getTcid() {
		return tcid;
	}
	public void setTcid(int tcid) {
		this.tcid = tcid;
	}
	public int getTbid() {
		return tbid;
	}
	public void setTbid(int tbid) {
		this.tbid = tbid;
	}
}
