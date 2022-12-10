import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Estudiantes, EstudianteService } from 'src/app/SERVICE/estudiante.service';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  estudianteaNueva: Estudiantes={id:'',nombres:'',apellidos:'',codigo:'',reunion:'',activo:false};

  constructor(private estudianteService: EstudianteService, private router:Router) { }

  ngOnInit(): void {

  }

  agregarEstudiantes(){
    this.estudianteService.saveEstudiantes(this.estudianteaNueva).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/inicio']);
      },
      err=>console.log(err)
    );
  }

}
