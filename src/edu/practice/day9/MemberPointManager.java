package edu.practice.day9;

import java.util.*;

public class MemberPointManager {
    Map<String, Integer> pointMap = new HashMap<String, Integer>();


    public MemberPointManager() {
        pointMap =new HashMap<>();
        pointMap.put("user01", 1000);
        pointMap.put("user02", 1500);
        pointMap.put("user03", 500);

    }

    public void registerMember(String memberId){
        if(pointMap.containsKey(memberId)){
            System.out.println("이미 존재하는 ID입니다.");
        } else{
            pointMap.put(memberId, null);
            System.out.println(memberId + "님이 신규 회원으로 등록되었습니다. ");
        }
    }

    public void earnPoints(String memberId, int points){
        if(pointMap.containsKey(memberId)){
            pointMap.put(memberId, pointMap.get(memberId) + points);
            System.out.println(memberId + "님에게 " + points + "포인트 적립되었습니다. 현재 포인트 : " + pointMap.get(memberId));
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    public void usePoints(String memberId, int points){
        int a = pointMap.get(memberId);
        if(a > points){
            int b = pointMap.get(memberId) - points;
            pointMap.put(memberId, b);
            System.out.println(memberId + "님이 " + points + "포인트 사용했습니다. 남은 포인트 : " + b);
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    public void displayAllMembers(){

        System.out.println("=== 전체 회원 포인트 정보");
        for(Map.Entry<String, Integer> entry : pointMap.entrySet()){
            System.out.printf("%-10s : %s \n", entry.getKey(), entry.getValue());
        }
    }
}
