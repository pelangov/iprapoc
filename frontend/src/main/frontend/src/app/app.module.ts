import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from './app.component';
import {logoComponent} from './logo.component';
import {leftPanelComponent} from './left-panel/left-panel.component';
import {rightPanelComponent} from './right-panel/right-panel.component';
import {newsComponent} from './news/news.component';
import {integrationUpdateComponent} from './integration-update/integration-update.component';
import {industryWatchComponent} from './industry-watch/industry-watch.component';
import {newsSliderComponent} from './news-slider/news-slider.component';
import {quickLinksComponent} from './quick-links/quick-links.component';
import {eventsHolidaysComponent} from './evnt-holiday/events-holidays.component';
import {corporateUpdComponent} from './corp-update/corporate-upd.component';
import { HttpModule } from '@angular/http';
import { Logger } from "angular2-logger/core";
import {LeftPanelService} from './left-panel/left-panel.service';




@NgModule ({
    imports: [BrowserModule,
      HttpModule],
    declarations : [
    AppComponent,
    logoComponent,
    leftPanelComponent,
    rightPanelComponent,
    newsComponent,
    integrationUpdateComponent,
    industryWatchComponent,
    newsSliderComponent,
    quickLinksComponent,
    eventsHolidaysComponent,
    corporateUpdComponent
    ],
    bootstrap : [AppComponent],
  providers:    [ Logger,LeftPanelService ]
})
export class AppModule {}
