import { Component, OnInit } from '@angular/core';
import { EstudianteService } from 'src/app/SERVICE/estudiante.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  lista:any=[];
  constructor(private estudianteService: EstudianteService) { }

  ngOnInit(): void {
    this.listarEstudiantes();
  }

  listarEstudiantes()
  {
    this.estudianteService.getEstudiantes().subscribe(
      res=>{
        this.lista=res;
        console.log(res);
      },
      err=>console.log(err)
    );

  }

  eliminar(id:string)
  {
    this.estudianteService.deleteEstudiante(id).subscribe(
      res=>{this.ngOnInit();},
      err=>console.log(err)
    );
  }

}
