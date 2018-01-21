import React  from 'react';
import reactdom from 'react-dom';
let obj1={};
class App extends React.Component{


    componentWillMount(){
        fetch("http://127.0.0.1/insert",{
            method: 'POST',
            
            body: {
              s: 'secondValue'
            }
        }).then((re)=>console.log(re))
       // $.post("http://127.0.0.1/insert",{s:'secondValue'},(data)=>console.log(data));
    }

    render(){
       
        return<div>
              交友
        </div>
    }

}


export  default  App;