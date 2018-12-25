package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		System.out.println("We find the following appliances with your parameters :");
		for (Appliance a : appliances){
			System.out.println(a.toString());
		}
		System.out.println();
	}

}
