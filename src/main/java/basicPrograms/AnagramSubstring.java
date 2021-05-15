package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class AnagramSubstring {

	public static void main(String[] args) {
		
		Solution a = new Solution();
		System.out.println(a.solution("Sat", 23));
	}

}

class Solution {
    public String solution(String S, int K) {
    	if(K==0) {
    		return S;
    	}
    	int pos = -1;
    	switch(S) {
    	case "Mon": pos=0;
    	break;
    	case "Tue": pos=1;
    	break;
    	case "Wed": pos=2;
    	break;
    	case "Thu": pos=3;
    	break;
    	case "Fri": pos=4;
    	break;
    	case "Sat": pos=5;
    	break;
    	case "Sun": pos=6;
    	break;
    	}    	
        List<String> weekList = new ArrayList<>();
        weekList.add("Mon");
        weekList.add("Tue");
        weekList.add("Wed");
        weekList.add("Thu");
        weekList.add("Fri");
        weekList.add("Sat");
        weekList.add("Sun");
        int tempPos = pos;
        for(int i=1;i<=K;++i) {

        	++tempPos; 
        	if(tempPos>6) {
        		tempPos = 0;
        	}       	
        }
        return weekList.get(tempPos);
    }
}