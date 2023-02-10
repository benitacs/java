import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routing } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { HelpComponentComponent } from './help-component/help-component.component';
import { ShelpComponent } from './shelp/shelp.component';
import { FormsModule } from '@angular/forms';
import { UserServiceClient } from 'src/services/user.service.client';
import { CourseComponent } from './course/course.component';
import { courseService } from 'src/services/couseservice';
import { AddcourseComponent } from './addcourse/addcourse.component';
import { HttpClientModule } from '@angular/common/http';
import { AddmoduleComponent } from './addmodule/addmodule.component';
import { AddlessonComponent } from './addlesson/addlesson.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfileComponent,
    RegisterComponent,
    HelpComponentComponent,
    ShelpComponent,
    CourseComponent,
    AddcourseComponent,
    AddmoduleComponent,
    AddlessonComponent,
    
  ],
  imports: [
    routing,
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    UserServiceClient,
    courseService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
