import React from 'react'
import Person from './Person';

function NameList() {
    const names = ['Rupesh', 'Ritesh', 'Sudeep', 'Durga'];
    // const namesList = names.map(name => <h2>{name}</h2>)
    // return (
    //     <div>
    //         {namesList}
    //     </div>
    // )
    const persons = [{
        id: 1,
        name: 'Rupesh',
        like: 'Bidi',
        skill: 'Core java'
    },
    {
        id: 2,
        name: 'Ritesh',
        like: 'Yes Sir',
        skill: 'Database'
    },
    {
        id: 3,
        name: 'Sudeep',
        like: 'Handia',
        skill: 'Angular'
    }];

    const personsList = persons.map(fetchedPerson =>
        <Person key={fetchedPerson.id} person={fetchedPerson}></Person>)

    return <div>{personsList}</div>

























    // const personsList = persons.map(fetchedPerson =>
    // // adding the person as props
    // // we must provide a key to avoid warning warning which is not usable for props.
    //     <Person key={fetchedPerson.id} person={fetchedPerson}></Person>
    // )

    // return <div>{personsList}</div>
}

export default NameList
