import {Component} from '@angular/core';

@Component({
    selector : 'pra-rightpanel',
    template: `<div class="rightcontainer">     
                    <div class="divFixedRight">
                        <div class="tblBodyMain">
                            <div class="pra-widget dashboardcontainer" style=" background-color: #E8EDF2;border:0px ;box-shadow:none;">
                                <div class="dashboard-full">
                                    <div class="pra-widget newscomponent" style=" background-color: #E8EDF2;border:0px ;box-shadow:none;">
                                        <pra-news></pra-news> 
                                    </div>
                                    <div class="pra-widget dashboardfull" style=" background-color: #E8EDF2;border:0px ;box-shadow:none;"> 
                                        <pra-integrationupd></pra-integrationupd>
                                        <pra-industrywatch></pra-industrywatch>                                                                                   
                                    </div>
                                </div>
                                <div class="rightside">
                                    <div class="dashboardfloat"> 
                                        <div class="floatwidgets">
                                            <div class="floating">
                                                <pra-newsslider></pra-newsslider>  
                                                <pra-corporateupd></pra-corporateupd>                                              
                                            </div>
                                        </div>
                                    </div>
                                    <div class="dashboardslider">  
                                        <div class="slidewidgets">
                                            <div class="slideleft">
                                                <pra-quicklinks></pra-quicklinks>
                                            </div>
                                            <div class="slideright">
                                                <pra-eventsholidays></pra-eventsholidays>
                                            </div>
                                        </div>
                                    </div>
                                </div>                                                            
                            </div>
                        </div>
                    </div>
                </div>`,
    styleUrls: ['./app.component.css']
})

export class rightPanelComponent {}