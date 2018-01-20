import React  from 'react';
import reactdom from 'react-dom';
let obj1={};
class App extends React.Component{


    componentWillMount(){
        fetch("http://127.0.0.1/user").then((re)=>re.json().then((obj)=>{
            obj1=obj;
            console.log(obj);


        }))

    }

    render(){
       
        return<div>
              交友
        </div>
    }

}


export  default  App;