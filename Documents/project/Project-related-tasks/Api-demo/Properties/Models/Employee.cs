using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace Api_demo.Properties.Models
{
    public class Employee
    {
        [Key]
        public int EmployeeId{get;set;}
        public string FirstName{get;set;}
        public string LastName{get;set;}
        public int Age{get;set;}
        public string DateOfJoining{get;set;}
        public int DepartmentId{get;set;}
        public Department department{get;set;}
        public int DesignationId{get;set;}
        public Designation designation{get;set;}
    }
}