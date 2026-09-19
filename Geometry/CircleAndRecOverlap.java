// lc-1401 Circle and Rectangle Overlapping
//hint
// Locate the closest point of the square to the circle, you can then find the distance from this point
//to the center of the circle and check if this is less than or equal to the radius.


class CircleAndRecOverlap {
    public boolean checkOverlap(int radius, int xcenter, int ycenter, int x1, int y1, int x2, int y2) {
        int xi;
        int yi;

        if(x1 > xcenter){
            xi=x1;
        }else if(x2 < xcenter){
            xi=x2;
        }else{
            xi=xcenter;
        }

        if(y1 > ycenter){
            yi=y1;
        }else if(y2 < ycenter){
            yi=y2;
        }else{
            yi=ycenter;
        }

        return Math.sqrt((xi-xcenter)*(xi-xcenter)+(yi-ycenter)*(yi-ycenter)) <=radius;
    }
}