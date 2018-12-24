package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;

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

        Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>(Speakers.class);
        criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 15);
        criteriaSpeakers.add(Speakers.CORD_LENGTH, 2);

        appliance = service.find(criteriaSpeakers);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);
        criteriaTabletPC.add(TabletPC.COLOR, "BLUE");

        appliance = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliance);

    }

}
