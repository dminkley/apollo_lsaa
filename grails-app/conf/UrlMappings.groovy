class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/altLociTrack/stats/global"(action: "globalStats", controller: "altLociTrack")

        "/"(controller: 'home', action: 'index')
        "500"(view:'/error')
	}
}
