package model;

import view.GUI;

import java.io.IOException;
import java.util.ArrayList;

import controler.Calculations;

public abstract class Node implements SpaceObject
{

    protected ArrayList<double[]> path = null;

    public ArrayList<double[]> getPath() throws IOException, InterruptedException
    {
        if(this.path == null || !(this.path.size() == Calculations.getNmax())){
            this.path = Calculations.getPath(this);
        }
        return path;
    }

    public abstract double getFrequency();

    public abstract void updatePosition(GUI gui);

}
