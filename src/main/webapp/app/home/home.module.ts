import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JhAppSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [JhAppSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent]
})
export class JhAppHomeModule {}
