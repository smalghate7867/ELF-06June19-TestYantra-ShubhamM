function searchName(search) {
    console.log(search.value);
    // var x = document.getElementById("search");
  //  var fetchPromise = fetch(`http://www.omdbapi.com/?s=${search.value}&apikey=1bb8b283`)
         //.then((success) => { success.json() })
       // .then((movies) => { console.log("movies:-->"+movies.Search) });
       // .catch((error) => { console.log("error:-->"+error) });
       //var forImg= document.getElementById("img");
       var output=''
       fetch(`http://www.omdbapi.com/?s=${search.value}&apikey=1bb8b283`).then((data) => {
         data.json().then((movies) => {
            var Titles = movies.Search;
            var output = '';
            for(let movie of Titles) {
              output = `
              <h1>${movie.Title}</h1>
              <img src="${movie.Poster}" alt="" srcset="">
              `
              document.getElementById("m").innerHTML=output;
              document.getElementById("imgid").innerHTML=output;
            }
           
         }).catch()
       }).catch()
 
}
