package com.example.patternstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.patternstest.bridge.BankSystem
import com.example.patternstest.bridge.CppDeveloper
import com.example.patternstest.bridge.JavaDeveloper
import com.example.patternstest.bridge.SecuritySystem
import com.example.patternstest.chain_of_responsibility.Handler1
import com.example.patternstest.chain_of_responsibility.Handler2
import com.example.patternstest.chain_of_responsibility.Handler3
import com.example.patternstest.mediator.*
import com.example.patternstest.state.LiquidState
import com.example.patternstest.state.Water
import com.example.patternstest.strategy.Car
import com.example.patternstest.strategy.ElectricMove
import com.example.patternstest.strategy.PetrolMove
import com.example.patternstest.visitor.JuniorDeveloper
import com.example.patternstest.visitor.Project
import com.example.patternstest.visitor.SeniorDeveloper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        //FactoryMethod
        var factory = WoodHouseFactory();
        var house = factory.createHouse();
        house.destroy()*/

/*        //AbstractFactory
        var factory = PlaneFactory()
        var controlDevice = factory.createControlDevice()
        controlDevice.control()*/

/*        //Builder
        var director = Director()
        var bread = director.orderBread("Ржаной")*/

/*        //Adapter
        var audiA3 = AudiA3()
        var audiA3Rus = AdapterForeignCarToRus(audiA3)
        var russianCarMarket = RussianCarMarket(audiA3Rus);
        russianCarMarket.testLightOn()*/

/*        //Composite
        var file1 = File("text.doc")
        var file2 = File("image.png")
        var directoryBig = Directory("DirectoryBig")
        var directorySmall = Directory("DirectorySmall")
        directoryBig.add(directorySmall)
        directorySmall.add(file1)
        directorySmall.add(file2)
        directoryBig.display()*/

/*        //Decorator
        var car = XenonCarDecorator(SpoilerCarDecorator(EmptyCar()))
        car.drive()*/

/*        //Facade
        val powerSystem = PowerSystem()
        val geolocationSystem = GeolocationSystem()
        val roadAdvisiorSystem = RoadAdvisiorSystem()
        val gps = GPS(powerSystem, geolocationSystem, roadAdvisiorSystem)
        gps.activate()*/

/*        //Flyweight
        var houseType1 = HouseTypeFactory().getHouseType("16 этажей, кирпич",
            "Кирпич", 16)
        var house1 = House(10, 15, houseType1)
        house1.build()
        var house2 = House(30, 40, houseType1)
        house2.build()*/

/*        //Proxy
        val proxyTimetableTrains = ProxyTimetableTrains(RealTimetableTrains())
        proxyTimetableTrains.loadData()
        proxyTimetableTrains.loadData()
        proxyTimetableTrains.loadData()*/

/*        //Chain of responsibility
        var h1 = Handler1()
        var h2 = Handler2()
        var h3 = Handler3()
        h1.setNextHandler(h2)
        h2.setNextHandler(h3)
        val typeUser = h1.checkData("User1", "a1d3g5")
        Log.e("typeUser", typeUser)*/

/*        //Mediator
        val managerMediator = ManagerMediator()
        val customer = Customer(managerMediator)
        val programmer = Programmer(managerMediator)
        val tester = Tester(managerMediator)
        managerMediator.customer = customer
        managerMediator.programmer = programmer
        managerMediator.tester = tester
        customer.send("Мне нужна программа")
        programmer.send("Программа написана")
        tester.send("Программа прошла тестирование")*/

/*        //State
        val water = Water(LiquidState())
        water.frost()
        water.frost()
        water.heat()
        water.heat()*/

/*        //Strategy
        val car = Car(ElectricMove())
        car.move()
        car.movable = PetrolMove()
        car.move()*/

/*        //Visitor
        val project = Project()
        project.create(JuniorDeveloper())
        project.create(SeniorDeveloper())*/

/*        //Bridge
        val bankSystem = BankSystem(JavaDeveloper()) // Можно поменять разработчиков местами
        bankSystem.createProject()
        val securitySystem = SecuritySystem(CppDeveloper())
        securitySystem.createProject()*/
    }
}