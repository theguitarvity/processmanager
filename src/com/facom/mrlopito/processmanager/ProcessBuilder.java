package com.facom.mrlopito.processmanager;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessBuilder  {
	private int currentPid;
	private Queue<Process> entranceQueue;
	
	
	public ProcessBuilder() {
		// TODO Auto-generated constructor stub
		this.currentPid = 0;
		this.entranceQueue = new LinkedList<Process>();
	}
	public void create() {
		if(this.entranceQueue.size() == 0) 
			this.entranceQueue.add(new Process(this.currentPid,0,0,0));
			
		this.entranceQueue.add(new Process(this.currentPid,0,0,0));
		
	}
	public void getProcess() {
		for(Process p : this.entranceQueue)
			System.out.println(p.getPid());
	}
	public int getPid() {
		return this.currentPid +=this.entranceQueue.size()-1;
	}
	
	
	
	
	
	

}
