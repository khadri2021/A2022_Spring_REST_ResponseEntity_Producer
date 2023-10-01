package com.khadri.spring.rest.entity;

public class Student {

	private Integer id;

	private String name;

	private String address;

	public Student(StudentBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
	}
	
	public static StudentBuilder builder() {
		return new StudentBuilder();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static class StudentBuilder {

		private Integer id;

		private String name;

		private String address;

		public StudentBuilder withId(Integer id) {
			this.id = id;
			return this;
		}

		public StudentBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
