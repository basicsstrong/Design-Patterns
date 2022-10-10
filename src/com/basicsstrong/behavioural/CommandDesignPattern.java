package com.basicsstrong.behavioural;

interface ICommandAC{
	public void execute();
}

class AC{
	public void turnOn() {
		System.out.println("Ac is on");
	}
	
	public void turnOff() {
		System.out.println("Ac is off");
	}
	
	public void decTemp() {
		System.out.println("Decreasing temprature by 1");
	}

	public void incTemp() {
		System.out.println("Increasing temprature by 1");
	}
}

class StartACCommand implements ICommandAC{
	
	AC ac;
	public StartACCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Turning on the AC");
		ac.turnOn();
		
	}
	
}


class IncTempCommand implements ICommandAC{
	
	AC ac;
	public IncTempCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Increasing the temprature");
		ac.incTemp();
		
	}
	
}


class DecTempCommand implements ICommandAC{
	
	AC ac;
	public DecTempCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Decreasing the temp");
		ac.decTemp();
		
	}
	
}


class StopACCommand implements ICommandAC{
	
	AC ac;
	public StopACCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Turning off the AC");
		ac.turnOff();
		
	}
	
}


class ACAutomationRemote{
	
	ICommandAC command;
	
	public void setCommand(ICommandAC command) {
		this.command = command;
	}
	
	public void buttonPressed() {
		command.execute();
	}
}
public class CommandDesignPattern {

	public static void main(String[] args) {
		
		AC acRoomOne = new AC();
		AC acRoomTwo = new AC();
		
		ACAutomationRemote remote = new ACAutomationRemote();
		
		remote.setCommand(new StartACCommand(acRoomOne));
		remote.buttonPressed();
		
		remote.setCommand(new StartACCommand(acRoomTwo));
		remote.buttonPressed();
		
		remote.setCommand(new IncTempCommand(acRoomTwo));
		remote.buttonPressed();
	}

}
