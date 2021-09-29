package com.company.telegram.commands;

import com.company.module.Visualizer;

public class MenuStart extends Command {

public String execute(){
return Visualizer.getHello();
}

}
