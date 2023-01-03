package kr.co.ch02.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

	// 생성자 DI
	@Autowired
	private CPU cpu;
	
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	// 세터 DI
	
	private RAM ram;
	
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	// 필드 DI
	@Autowired
	private HDD hdd;
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
}
