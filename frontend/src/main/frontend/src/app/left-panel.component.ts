import {Component} from '@angular/core';

@Component({
    selector : 'pra-leftpanel',
    template : `
    <div class="divFixedLeft">
    <table cellspacing="0" cellpadding="0" class="tblMenuMain">
        <tr>
            <td style="vertical-align: middle; padding-top: 20px; height: 12%">
               <pra-logo></pra-logo>
            </td>
        </tr> 
        <tr style="height: 10%; ">    
            <td>    
             <div class="wrapper" id="element" style=" position: relative; ">   
             <input (keyup)= "onkey($event)" type="text" id="searchBox" class="search left rounded"/> 
              <span id ="searchBoxDropdown" class="down" ></span>
              <ul *ngIf="entered" class="dropdown" id ="searchBoxfilter">
                <li><input type="radio" id="contentSearch" name="one" checked="checked" style=" vertical-align: middle; margin-right: 7%; "/><label for="Search InsidePRA" style=" font-weight: normal; ">Search InsidePRA</label></li>
                <li><input type="radio" id="employeeSearch" name="one" style=" vertical-align: middle; margin-right: 7%;margin-left: 2%; "/><label for="Search Employees" style=" font-weight: normal; ">Search Employees</label></li>
              </ul>
              </div>    
            </td>
        </tr>   
         <tr>
            <td style="vertical-align: top; text-align: left; font-size: 1em; padding: 0;margin-top: 10%;float: left;">
                <nav id="navigation" class="navigation">                   
                </nav>
            </td>
        </tr>
         <tr>
            <td style="vertical-align: top; padding-bottom: 5px; text-align: center;float: left;">
                <div class="pratextimg"></div>               
                <a id="logout" class="logout">Logout</a>               
            </td>
        </tr>   
    </table>
</div>`,
styleUrls : ['./app.component.css']
  
})

export class leftPanelComponent {
 values = '';
 entered =  false;

    onkey(event : any){
        this.values += event.target.value + ' | '; 
        this.entered = true;       
    } 
}