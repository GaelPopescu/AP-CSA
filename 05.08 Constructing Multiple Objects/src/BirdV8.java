class BirdV8 {
    // Default Constructor
    double wingspan;
    double xpos;
    double ypos;
    public BirdV8(){}
    public BirdV8(double Wingspan, double Xpos, double Ypos){
        wingspan = Wingspan;
        xpos = Xpos;
        ypos = Ypos;
    }

    // First Method  Methods
    public double flap(double yc, double wing){ return (yc + wing/3); }
    // Overloaded Method
    public void flap(){
        ypos = ypos + wingspan/3;
        xpos = xpos + wingspan/4;
    }
    // Getter Methods
    public double getWingspan(){return wingspan;}
    public double getXpos() {return xpos;}
    public double getYpos() {return ypos;}
}
