package com.java;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	private MobileProcessor mcpu;

	public MobileProcessor getMcpu() {
		return mcpu;
	}

	public void setMcpu(MobileProcessor mcpu) {
		this.mcpu = mcpu;
	}
	
	public void MobileConfi()
	{
		System.out.println(" 8GB RAM, Dual Core,128px Camera");
		mcpu.processor();
	}

}
