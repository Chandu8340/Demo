package com.capg;

public class Employee implements Comparable<Employee> {

		private int eid;
		private String ename;
		private double salary;	

		public Employee(int eid, String ename, double salary) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return this.eid+" ";
		}

		@Override
		public int hashCode() {
			
			return eid;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (eid != other.eid)
				return false;
			return true;
		}

		@Override
		public int compareTo(Employee e2) {
			Employee e1=this;
			String s1=e1.toString();
			String s2=e2.toString();
			return -s1.compareTo(s2);
		}
		

	}

	


