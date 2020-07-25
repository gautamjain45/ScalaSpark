abstract class Employee {
  def employeePackage: Double
  def employeesAvailable : Int
  def employeesFrom:List[String]
  def hire(numberOfEmployees:Int)
}

//Companion object of above declared class
object Employee{
  val FullTime = 0
  val PartTime = 1
  val Contract = 2


  private class fullTimeEmployee extends Employee {
    private var _employeeAvailable = 200

    override def employeesAvailable: Int = _employeeAvailable

    override def employeePackage: Double = 2000000

    override def employeesFrom: List[String] = List("Credit Suisse", "Nomura", "Bank Of America")

    override def hire(numberOfEmployees: Int): Unit = {
      _employeeAvailable = _employeeAvailable - numberOfEmployees
    }
  }

  private class partTimeEmployee extends Employee {
      private var _employeeAvailable = 150

      override def employeesAvailable: Int = _employeeAvailable

      override def employeePackage: Double = 1000000

      override def employeesFrom: List[String] = List("MacDonalds", "Pizza Hut", "Dominos")

      override def hire(numberOfEmployees: Int): Unit = {
        _employeeAvailable = _employeeAvailable - numberOfEmployees
      }
    }

  private class contractEmployee extends Employee {
        private var _employeeAvailable = 150
        override def employeesAvailable: Int = _employeeAvailable
        override def employeePackage: Double = 4000000
        override def employeesFrom: List[String] = List("Accenture","ODA","HCL")
        override def hire(numberOfEmployees: Int): Unit = {
          _employeeAvailable = _employeeAvailable - numberOfEmployees
        }
  }

  def apply(employeeType:Int): Employee = {
        employeeType match {
          case FullTime => new fullTimeEmployee()
          case PartTime => new partTimeEmployee()
          case Contract => new contractEmployee()
          case _ => new fullTimeEmployee()
        }
      }

  def main(args:Array[String]): Unit = {
        val e = Employee(FullTime)
        println(e.employeePackage)
        println(e.employeesAvailable)
      }
}