import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddcourseComponent } from './addcourse/addcourse.component';
import { AddlessonComponent } from './addlesson/addlesson.component';
import { AddmoduleComponent } from './addmodule/addmodule.component';
import { CourseComponent } from './course/course.component';
import { HelpComponentComponent } from './help-component/help-component.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { ShelpComponent } from './shelp/shelp.component';


const routes: Routes = [
{path:'login',component:LoginComponent},
{path:'profile/:userId',component:ProfileComponent},
{path:'register/:userId',component:RegisterComponent},
{path:'course',component:CourseComponent},
{path:'shelp',component:ShelpComponent},
{path:'addcourse',component:AddcourseComponent},
{path:'addmodule',component:AddmoduleComponent},
{path:'addlesson',component:AddlessonComponent}
];
export const routing = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

