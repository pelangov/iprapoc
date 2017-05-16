import {Component, OnInit} from '@angular/core';
import {LeftPanelService} from "./left-panel.service";
import {Link} from './link';

@Component({
    selector : 'pra-leftpanel',
    template: `<div class="divFixedLeft">
  <table cellspacing="0" cellpadding="0" class="tblMenuMain">
    <tr>
      <td style="vertical-align: middle; padding-top: 20px; height: 12%">        
         <div class="praimg"></div>
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
        <nav class="navigation" id="navigation">
          <ul>
            <li *ngFor="let lin of linkList">
              <i  class="{{lin.cssClass}}" style="float:left"></i><a href="#">&nbsp;{{lin.name}}</a>   
              <ul class="submenu">                    
                    <li  *ngFor="let slin of lin.subLinks">
                      <a href="#" target="">{{slin.name}}</a>
                       <ul class="subsubmenu">
                           <li *ngFor="let sslin of slin.subLinks">
                             <a href="#" target="">{{sslin.name}}</a>
                           </li>
                       </ul>
                    </li>
              </ul>
            </li>
          </ul>
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
    styleUrls : ['../app.component.css'],
    providers : [LeftPanelService]

})

export class leftPanelComponent implements OnInit{
  private linkResponse:string;
  linkList : Link[];
  private _subscription;
  private errorMessage;
  values = '';

 entered =  false;

 constructor(private  leftPnlSer : LeftPanelService){}

 /*ngOnInit() : void{
    this.leftPnlSer.getLeftMenuLinks()
      .subscribe( result => console.log(result),error => this.errorMessage = error);
    debugger;
 } */
  private jsonResponse: string;
  private messages: Array<Link>;


  /*ngOnInit() {
    // save _subscription
    this._subscription = this.leftPnlSer.getLeftMenuLinks()
      .subscribe(
        (data) => {
          this.jsonResponse = JSON.stringify(data);
          this.messages = data;
        },
        (err) => console.log(err),
        () => console.log('service test complete')
      );
  }*/

  ngOnInit() {
    this.leftPnlSer.getLeftMenuLinks()
      .subscribe(list => {
        this.linkList = list
      });
    console.log('Response data: ' || this.linkList);
  }

  // on-destroy
  ngOnDestroy() {
    // unsubscribe
    this._subscription.unsubscribe();
  }

    onkey(event : any){
        this.values += event.target.value + ' | ';
        this.entered = true;
    }
}
