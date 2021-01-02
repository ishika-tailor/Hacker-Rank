//Date in Java
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class calendarPractice{
	public static void main(String[] args) {
			
			Calendar cal=Calendar.getInstance();
			cal.add(Calendar.DATE,0);
			System.out.println(cal.getTime());
			System.out.println("helo");
			SimpleDateFormat format1=new SimpleDateFormat("yyyy-mm-dd");
			String formated=format1.format(cal.getTime());
			System.out.println(formated);
	}
}

//scope: lifetime and accessibility of variable
// packages: util,io,aws,lang,net

//Question: 14 Find Maximum difference
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;

    public:
    Difference(vector<int> a){
        elements=a;
        maximumDifference=0;
    }
	public:
    void computeDifference(){
        for(int i=0;i<elements.size();i++){
            for(int j=i+1;j<elements.size();j++){
                if(maximumDifference<abs(elements[i]-elements[j])){
                    maximumDifference=abs(elements[i]-elements[j]);
                }
            }
        }
    }

}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}