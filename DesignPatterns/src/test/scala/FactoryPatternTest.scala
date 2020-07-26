import org.scalatest.FunSuite

class FactoryPatternTest extends FunSuite {

  //------------------------------------------ PART TIME Test-----------------------------------

  //Fail Test
  test("Employee.FullTimeFail") {
    var fullTime = 0
    assert(Employee(fullTime).employeePackage != 1000000)
  }

  //Success Test
  test("Employee.FullTimeSuccess") {
    var fullTime = 0
    assert(Employee(fullTime).employeePackage === 2000000)
  }

  //Employee Object Test
  test("Employee.EmployeeFullTimeObj") {
    assert(Employee.FullTime === Employee.FullTime)
  }
  //------------------------------------------ PART TIME Test-----------------------------------
  //Fail Test
  test("Employee.ParTimeFail") {
    var partTime = 1
    assert(Employee(partTime).employeePackage != 2000000)
  }

  //Success Test
  test("Employee.PartTimeSuccess") {
    var partiTime = 1
    assert(Employee(partiTime).employeePackage === 1000000)
  }

  //Employee Object Test
  test("Employee.EmployeePartTimeObj") {
    assert(Employee.PartTime === Employee.PartTime)
  }

  //------------------------------------------ Contract Test-----------------------------------
  //Fail Test
  test("Employee.ContractFail") {
    var contract = 2
    assert(Employee(contract).employeePackage != 1000000)
  }

  //Success Test
  test("Employee.ContractSuccess") {
    var contract = 2
    assert(Employee(contract).employeePackage === 4000000)
  }

  //Employee Object Test
  test("Employee.EmployeeContractObj") {
    assert(Employee.Contract === Employee.Contract)
  }

}