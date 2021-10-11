package com.point2D;
public class Point2D {
private int x=10;
private int y=20;
Point2D(int a,int b){
x=a;
y=b;
}
public String getDetails() {
return ("The points for x-axis is :" + x + "Point for y-axis is :" + y);
}
public boolean isEqual(Point2D P1,Point2D P2) {
if(P1.x==P2.x && P1.y==P2.y) {
return true;
}
else {
return false;
}
} public static void main(String[] args) {
Point2D P=new Point2D(40,20);
P.getDetails();
P.isEqual(P, P);
}}


	

