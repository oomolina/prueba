import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {Estudiantes, EstudianteService } from 'src/app/SERVICE/estudiante.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  id:string="";
  estudianteaNueva: Estudiantes={id:'',nombres:'',apellidos:'',codigo:'',reunion:'',activo:false};
  constructor(
    private estudianteService:EstudianteService,
    private antivateRouter: ActivatedRoute,
    private router:Router
    ) { }

  ngOnInit(): void {
    this.id= this.antivateRouter.snapshot.params.id;
    this.estudianteService.getUnaEstudiantes(this.id).subscribe(
      res=>{
        this.estudianteaNueva=res;
      },

      err=>console.log(err)
    );
  }
  
  guardad(){
    this.estudianteService.editEstudiante(this.id, this.estudianteaNueva).subscribe(
      res=>{
        this.router.navigate(['/inicio']);
      },

      err=>console.log(err)
    );
  }

}
