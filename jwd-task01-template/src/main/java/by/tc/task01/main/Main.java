package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
        criteriaOven.add(Oven.CAPACITY, 33);
        criteriaOven.add(Oven.DEPTH, 60);

        appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>(Laptop.class);
        criteriaLaptop.add(Laptop.CPU, 1.2);
        criteriaLaptop.add(Laptop.DISPLAY_INCHS, 18);

        appliances = service.find(criteriaLaptop);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria<Refrigerator> criteriaRefrigerator = new Criteria<Refrigerator>(Refrigerator.class);
        criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, 200);
        criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 15);

        appliances = service.find(criteriaRefrigerator);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>(VacuumCleaner.class);
        criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 100);
        criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");

        appliances = service.find(criteriaVacuumCleaner);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
        criteriaTabletPC.add(TabletPC.COLOR, "red");

        appliances = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>(Speakers.class);
        criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 17);
        criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-3.5");

        appliances = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliances);

    }

}
