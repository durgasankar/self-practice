// import React from 'react'

// // fetching the props by destructuring
// function Person({person}) {
//     return (
//         <div>
//             <h2>
//                 I am {person.name}, my skill is {person.skill} and I like {person.like}
//             </h2>
//         </div>
//     )
// }

// export default Person

import React from 'react'

function Person({ person }) {
    return (
        <div>
            <p>
                I am {person.name}, my skill is {person.skill} and I like {person.like}</p>
        </div>
    )
}
export default Person