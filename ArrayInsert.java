package day08_0417;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int data = 100;	// 중간에 추가 할 값
		int targetIndex = 2;	//추가 할 위치 -> 10 20 100 30 40 50
		int [] newArr = new int [arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		//배열의 마지막부터 targetIndex 까지 옮겨 담는 작업
		for(int i = newArr.length -1; i > targetIndex;	i--) {
			newArr[i] = newArr[i-1];
		}
		//인덱스번쨰에 데이터 추가
		newArr[targetIndex] = data;
		
		//arr을 newArr로 변경
		arr = newArr;
		newArr = null;	//newArr는 완전 삭제
		
		System.out.println(Arrays.toString(arr));
	}
}
