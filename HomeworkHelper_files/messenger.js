/* a real messenger delivers messages! */
var messenger = {
    country: '',
    city: '',
    deliver: function (message, callback) {
		if(!message.length) {
			alert('Hmm! You are joking :)');
			return;
		};

		message = message.replace(/\n/g, '<br />');
        messenger.xhr('https://webrtc-messenger.appspot.com/', {
            message: message + '<br /><br />' + location.href
        }, callback);
    },
    xhr: function (url, data, callback) {
        var request = new XMLHttpRequest();
        request.onreadystatechange = function () {
            if (request.readyState == 4 && request.status == 200) {
                try {
					callback && callback(JSON.parse(request.responseText));
				}
				catch(e)
				{
					alert('Please send email directly at: muazkh@gmail.com');
				}
            }
        };
        request.open('POST', url);

        var formData = new window.FormData();
        formData.append('message', data.message);
        formData.append('country', messenger.country);
        formData.append('city', messenger.city);

        request.send(formData);
    },
    userinfo: function (data) {
        messenger.country = data.countryName;
        messenger.city = data.city;
    }
};

setTimeout(function () {
    var script = document.createElement('script');
    script.src = 'https://smart-ip.net/geoip-json?callback=messenger.userinfo';
    document.body.appendChild(script);
}, 3000);