package in.iamandroid.creational.builder;

public class Student {
	long rollNo;
	String name;
	double fee;
	long mobileNo;
	char gender;
	boolean isMarried;
	public Student() {}
	public Student(long rollNo, String name, double fee, long mobileNo, char gender, boolean isMarried) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.isMarried = isMarried;
	}
	public Student(StudentBuilder builder)
	{
		this.rollNo=builder.rollNo;
		this.fee=builder.fee;
		this.gender=builder.gender;
		this.isMarried=builder.isMarried;
		this.mobileNo=builder.mobileNo;
		this.name=builder.name;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fee=" + fee + ", mobileNo=" + mobileNo + ", gender="
				+ gender + ", isMarried=" + isMarried + "]";
	}	
	public static class StudentBuilder
	{
		long rollNo;
		String name;
		double fee;
		long mobileNo;
		char gender;
		boolean isMarried;
		public StudentBuilder(long rollNo, String name, double fee, long mobileNo) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.fee = fee;
			this.mobileNo = mobileNo;
		}
		public StudentBuilder setRollNo(long rollNo) {
			this.rollNo = rollNo;
			return this;
		}
		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public StudentBuilder setFee(double fee) {
			this.fee = fee;
			return this;
		}
		public StudentBuilder setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
			return this;
		}
		public StudentBuilder setGender(char gender) {
			this.gender = gender;
			return this;
		}
		public StudentBuilder setMarried(boolean isMarried) {
			this.isMarried = isMarried;
			return this;
		}
		public Student build()
		{
			return new Student(rollNo, name, fee, mobileNo, gender, isMarried);
		}
	}
}