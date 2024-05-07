package day0321;

public class Ex3_ArrayStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr = {"하석진","강호동","강호마","Candy","손석구"};
		// 정렬
		for(int i=0; i<arr.length-1; i++) { // 0부터 시작하기 때문에 length에서 -1을 해준다
			for(int j=i+1; j<arr.length; j++) { // i가 0부터 시작해서 비교하기위해 j를 +1 해준다
				// 기준값이 더 클경우 양수값이 발생
				//if(arr[i].compareTo(arr[j])>0) // 오름차순
				if(arr[i].compareTo(arr[j])<0) // 내림차순

				{
					String stemp = arr[i];
					arr[i] = arr[j];
					arr[j] = stemp;

				}
			}
		}
		System.out.println("** 순서대로 출력하기 **");
		for(String s:arr)
			System.out.println(s);
	}

}
