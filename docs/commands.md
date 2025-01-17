## Slash Commands

### Command name: `about`
**Description**: Learn about this bot

* Arguments:
None
---
### Command name: `curseforge search`
**Description**: Search for mods on CurseForge

* **Arguments**:
	* `query` - The query to search for - String
	* `limit` - Set the Limit of Search results - Defaulting Int/Long

---
### Command name: `modrinth user`
**Description**: Search for a User

* **Arguments**:
	* `query` - User to search up - String

---
### Command name: `modrinth project`
**Description**: Get a Project by it's slug

* **Arguments**:
	* `slug` - the slug of the project you want to look up - String

---
### Command name: `modrinth search`
**Description**: Search for a mod/plugin

* **Arguments**:
	* `query` - Query to search - String
	* `limit` - limit search results - Defaulting Int/Long

---
### Command name: `modrinth advanced`
**Description**: Advanced search

* **Arguments**:
	* `string` - Query to search - String

---
### Command name: `log-whitelist add`
**Description**: Add a channel to the log-uploading whitelist

* **Arguments**:
	* `channel` - Channel to add to the Whitelist - Channel

---
### Command name: `log-whitelist remove`
**Description**: Remove a channel to the log-uploading whitelist

* **Arguments**:
	* `channel` - Channel to add to the Whitelist - Channel

---
### Command name: `log-whitelist list`
**Description**: List all channels that are in the whitelist

* **Arguments**:
None
---
### Command name: `log-blacklist add`
**Description**: Add a channel to the log-uploading blacklist

* **Arguments**:
	* `channel` - Channel to add to the Whitelist - Channel

---
### Command name: `log-blacklist remove`
**Description**: Remove a channel to the log-uploading blacklist

* **Arguments**:
	* `channel` - Channel to add to the Whitelist - Channel

---
### Command name: `log-blacklist list`
**Description**: List all channels that are in the blacklist

* **Arguments**:
None
---
### Command name: `config set`
**Description**: Set the Config

* **Arguments**:
	* `type` - What Listtype should be used. - String Choice

---
### Command name: `config get`
**Description**: Set the Config

* **Arguments**:
None
---
### Command name: `barn class`
**Description**: Look up Barn mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary - Defaulting Boolean

---
### Command name: `barn field`
**Description**: Look up Barn mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary - Defaulting Boolean

---
### Command name: `barn method`
**Description**: Look up Barn mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary - Defaulting Boolean

---
### Command name: `barn info`
**Description**: Get information for Barn mappings.

* **Arguments**:
None
---
### Command name: `feather class`
**Description**: Look up Feather mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of Calamus - Defaulting Boolean

---
### Command name: `feather field`
**Description**: Look up Feather mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of Calamus - Defaulting Boolean

---
### Command name: `feather method`
**Description**: Look up Feather mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of Calamus - Defaulting Boolean

---
### Command name: `feather info`
**Description**: Get information for Feather mappings.

* **Arguments**:
None
---
### Command name: `lyarn class`
**Description**: Look up Legacy Yarn mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `lyarn field`
**Description**: Look up Legacy Yarn mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `lyarn method`
**Description**: Look up Legacy Yarn mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `lyarn info`
**Description**: Get information for Legacy Yarn mappings.

* **Arguments**:
None
---
### Command name: `mcp class`
**Description**: Look up MCP mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version

---
### Command name: `mcp field`
**Description**: Look up MCP mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version

---
### Command name: `mcp method`
**Description**: Look up MCP mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version

---
### Command name: `mcp info`
**Description**: Get information for MCP mappings.

* **Arguments**:
None
---
### Command name: `mojang class`
**Description**: Look up Mojang mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `mojang field`
**Description**: Look up Mojang mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `mojang method`
**Description**: Look up Mojang mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `mojang info`
**Description**: Get information for Mojang mappings.

* **Arguments**:
None
---
### Command name: `hashed class`
**Description**: Look up Hashed Mojang mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `hashed field`
**Description**: Look up Hashed Mojang mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `hashed method`
**Description**: Look up Hashed Mojang mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `hashed info`
**Description**: Get information for Hashed Mojang mappings.

* **Arguments**:
None
---
### Command name: `plasma class`
**Description**: Look up Plasma mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `plasma field`
**Description**: Look up Plasma mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `plasma method`
**Description**: Look up Plasma mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `plasma info`
**Description**: Get information for Plasma mappings.

* **Arguments**:
None
---
### Command name: `quilt class`
**Description**: Look up Quilt mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of hashed - Defaulting Boolean

---
### Command name: `quilt field`
**Description**: Look up Quilt mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of hashed - Defaulting Boolean

---
### Command name: `quilt method`
**Description**: Look up Quilt mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of hashed - Defaulting Boolean

---
### Command name: `quilt info`
**Description**: Get information for Quilt mappings.

* **Arguments**:
None
---
### Command name: `srg class`
**Description**: Look up SRG Mojang mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of SRG - Defaulting Boolean

---
### Command name: `srg field`
**Description**: Look up SRG Mojang mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of SRG - Defaulting Boolean

---
### Command name: `srg method`
**Description**: Look up SRG Mojang mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of SRG - Defaulting Boolean

---
### Command name: `srg info`
**Description**: Get information for SRG Mojang mappings.

* **Arguments**:
None
---
### Command name: `yarn class`
**Description**: Look up Yarn mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `yarn field`
**Description**: Look up Yarn mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `yarn method`
**Description**: Look up Yarn mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `channel` - Mappings channel to use for this query - Optional official/snapshot
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `yarn info`
**Description**: Get information for Yarn mappings.

* **Arguments**:
None
---
### Command name: `yarrn class`
**Description**: Look up Yarrn mappings info for a class.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `yarrn field`
**Description**: Look up Yarrn mappings info for a field.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `yarrn method`
**Description**: Look up Yarrn mappings info for a method.

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `version` - Minecraft version to use for this query - Optional version
	* `map-descriptor` - Whether to map field/method descriptors to named instead of intermediary/hashed - Defaulting Boolean

---
### Command name: `yarrn info`
**Description**: Get information for Yarrn mappings.

* **Arguments**:
None
---
### Command name: `convert class`
**Description**: Convert a class mapping

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `input` - The namespace to convert from - String
	* `output` - The namespace to convert to - String
	* `version` - Minecraft version to use for this query - Optional String
	* `input-channel` - The mappings channel to use for input - Optional official/snapshot
	* `output-channel` - The mappings channel to use for output - Optional official/snapshot

---
### Command name: `convert field`
**Description**: Convert a field mapping

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `input` - The namespace to convert from - String
	* `output` - The namespace to convert to - String
	* `version` - Minecraft version to use for this query - Optional String
	* `input-channel` - The mappings channel to use for input - Optional official/snapshot
	* `output-channel` - The mappings channel to use for output - Optional official/snapshot

---
### Command name: `convert method`
**Description**: Convert a method mapping

* **Arguments**:
	* `query` - Name to query mappings for - String
	* `input` - The namespace to convert from - String
	* `output` - The namespace to convert to - String
	* `version` - Minecraft version to use for this query - Optional String
	* `input-channel` - The mappings channel to use for input - Optional official/snapshot
	* `output-channel` - The mappings channel to use for output - Optional official/snapshot

---
### Command name: `convert info`
**Description**: Get information about /convert and its subcommands

* **Arguments**:
None
---
### Command name: `mappings timeout`
**Description**: Set a custom timeout for the buttons on mappings paginators

* **Arguments**:
	* `timeout` - Set the duration (in seconds) until the paginator buttons are removed - Optional Int/Long

---
### Command name: `mappings namespaces`
**Description**: Configure which namespaces can be used in conversion commands

* **Arguments**:
None
---
### Command name: `command-list`
**Description**: Shows a list of Allium's commands!

* Arguments:
None
---
## Message Commands

None

---
## User Commands

None

---
