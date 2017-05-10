import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from './app.component';
import {logoComponent} from './logo.component';
import {leftPanelComponent} from './left-panel.component';
import {rightPanelComponent} from './right-panel.component';
import {newsComponent} from './news.component';
import {integrationUpdateComponent} from './integration-update.component';
import {industryWatchComponent} from './industry-watch.component';
import {newsSliderComponent} from './news-slider.component';
import {quickLinksComponent} from './quick-links.component';
import {eventsHolidaysComponent} from './events-holidays.component';
import {corporateUpdComponent} from './corporate-upd.component';

@NgModule ({
    imports: [BrowserModule],
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
    bootstrap : [AppComponent]
})
export class AppModule {}