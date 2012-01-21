package edu.umich.dice3;

import java.util.Map;

public class SoarMatchConfig
{
    public boolean spawnDebugger;
    public boolean useGui;
    public boolean learningOn;
    public boolean firstGames;
    public String writeOverride;
    public boolean collectMetadata;
    
    // Newer options
    public boolean optimizedKernel = false;
    public double temperature = -1.0;

    @Override
    public String toString()
    {
        return "SoarMatchConfig, "
                + "spawnDebugger: " + spawnDebugger + ", "
                + "useGui: " + useGui + ", "
                + "learningOn: " + learningOn + ", "
                + "firstGames: " + firstGames + ", "
                + "writeOverride: " + writeOverride + ", "
                + "collectMetadata: " + collectMetadata + ", "
                + "optimizedKernel: " + optimizedKernel + ", "
                + "temperature: " + temperature + ".";
        }
}
