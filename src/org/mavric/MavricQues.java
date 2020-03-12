package org.mavric;

public class MavricQues {

		static int count=0;
		
		
		private void increment() {
			System.out.println(count);
			count++;
		}
		public static void main(String[] args) {
			MavricQues o=new MavricQues();
			MavricQues o1=new MavricQues();
		o.increment();
		o1.increment();
		System.out.println("o : count is= "+o.count);
		System.out.println("o1 : count is= "+o1.count);
		}
	}

