

	class Animals{
		void display() {
			System.out.println("Animal class");
		}
	}
	class Dog extends Animals{
		void display() {
			System.out.println("Dog class");
		}
	
   public static void main(String args[]) {
	   Animals a=new Dog();
	   a.display();
   }
}

