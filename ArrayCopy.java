package day08_0417;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열의 복사 - 길이가 고정
		//복사의 개념 2개 1.얕은복사, 2.깊은복사
		System.out.println("얕은복사");
		//1. 얕은복사 - 주소값의 복사(원본배열도 같이 변경됨)
		int [] arr = {1,2,3,4,5};
		int [] newArr = arr;
		
		//주의 할 점
		newArr [0] = 100;	// arr - newArr 원본 배열도 변경 됨
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
		System.out.println("깊은복사");
		//2. 깊은 복사 - 완전히 새로운 배열을 만들고, 요소를 담는다.
		int [] arr2 = new int[arr.length];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		//값을 변경하더라도 원본배열에는 영향이 없다
		arr2[0] = 200;
		System.out.println("원본 : " + Arrays.toString(arr));
		System.out.println("사본 : " + Arrays.toString(arr2));
		
		
	}

}
