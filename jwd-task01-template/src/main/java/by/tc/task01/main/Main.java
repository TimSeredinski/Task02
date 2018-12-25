package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

    public static void main(String[] args) {


        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
        criteriaOven.add(Oven.CAPACITY, 33);
        criteriaOven.add(Oven.DEPTH, 60);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>(Laptop.class);
        criteriaLaptop.add(Laptop.CPU, 1.2);
        criteriaLaptop.add(Laptop.DISPLAY_INCHS, 18);

        appliance = service.find(criteriaLaptop);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<Refrigerator> criteriaRefrigerator = new Criteria<Refrigerator>(Refrigerator.class);
        criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, 200);
        criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 15);

        appliance = service.find(criteriaRefrigerator);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>(VacuumCleaner.class);
        criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 100);
        criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");

        appliance = service.find(criteriaVacuumCleaner);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
        criteriaTabletPC.add(TabletPC.COLOR, "blue");

        appliance = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>(Speakers.class);
        criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 17);
        criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-3.5");

        appliance = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliance);

    }

}
